package com.shop.utils;

public class Geohash0 {

    public static int BITS[] = { 16, 8, 4, 2, 1 };

    public static String BASE32 = "0123456789bcdefghjkmnpqrstuvwxyz";

    public static int RIGHT = 0;
    public static int LEFT = 1;
    public static int TOP = 2;
    public static int BOTTOM = 3;

    public static int EVEN = 0;
    public static int ODD = 1;

    public static String[][] NEIGHBORS;
    public static String[][] BORDERS;

    static {
            NEIGHBORS = new String[4][2];
            BORDERS = new String[4][2];

            NEIGHBORS[BOTTOM][EVEN] = "bc01fg45238967deuvhjyznpkmstqrwx";
            NEIGHBORS[TOP][EVEN] = "238967debc01fg45kmstqrwxuvhjyznp";
            NEIGHBORS[LEFT][EVEN] = "p0r21436x8zb9dcf5h7kjnmqesgutwvy";
            NEIGHBORS[RIGHT][EVEN] = "14365h7k9dcfesgujnmqp0r2twvyx8zb";

            BORDERS[BOTTOM][EVEN] = "bcfguvyz";
            BORDERS[TOP][EVEN] = "0145hjnp";
            BORDERS[LEFT][EVEN] = "prxz";
            BORDERS[RIGHT][EVEN] = "028b";

            NEIGHBORS[BOTTOM][ODD] = NEIGHBORS[LEFT][EVEN];
            NEIGHBORS[TOP][ODD] = NEIGHBORS[RIGHT][EVEN];
            NEIGHBORS[LEFT][ODD] = NEIGHBORS[BOTTOM][EVEN];
            NEIGHBORS[RIGHT][ODD] = NEIGHBORS[TOP][EVEN];

            BORDERS[BOTTOM][ODD] = BORDERS[LEFT][EVEN];
            BORDERS[TOP][ODD] = BORDERS[RIGHT][EVEN];
            BORDERS[LEFT][ODD] = BORDERS[BOTTOM][EVEN];
            BORDERS[RIGHT][ODD] = BORDERS[TOP][EVEN];
    }

    private static void refine_interval(double[] interval, int cd, int mask) {
            if ((cd & mask) > 0) {
                    interval[0] = (interval[0] + interval[1]) / 2.0;
            } else {
                    interval[1] = (interval[0] + interval[1]) / 2.0;
            }
    }

    public static String calculateAdjacent(String srcHash, int dir) {
            srcHash = srcHash.toLowerCase();
            char lastChr = srcHash.charAt(srcHash.length() - 1);
            int type = (srcHash.length() % 2) == 1 ? ODD : EVEN;
            String base = srcHash.substring(0, srcHash.length() - 1);
            if (BORDERS[dir][type].indexOf(lastChr) != -1) {
                    base = calculateAdjacent(base, dir);
            }
            return base + BASE32.charAt(NEIGHBORS[dir][type].indexOf(lastChr));
    }
    
    
    

	public static String[] getGeoHashExpand(String geohash) {
		try {
			String geohashTop = calculateAdjacent(geohash, TOP);
			String geohashBottom = calculateAdjacent(geohash, BOTTOM);
			String geohashRight = calculateAdjacent(geohash, RIGHT);
			String geohashLeft = calculateAdjacent(geohash, LEFT);
	
			String geohashTopLeft = calculateAdjacent(geohashLeft, TOP);
			String geohashTopRight = calculateAdjacent(geohashRight, TOP);
			String geohashBottomRight = calculateAdjacent(geohashRight, BOTTOM);
			String geohashBottomLeft = calculateAdjacent(geohashLeft, BOTTOM);
	
			String[] expand = { geohash, geohashTop, geohashBottom, geohashRight, geohashLeft, geohashTopLeft,
					geohashTopRight, geohashBottomRight, geohashBottomLeft };
			return expand;
		} catch (Exception e) {
			//logger.error("GeoHash Error",e);
			return null;
		}
	}
    

    public static double[][] decode(String geohash) {
            boolean is_even = true;
            double[] lat = new double[3];
            double[] lon = new double[3];

            lat[0] = -90.0;
            lat[1] = 90.0;
            lon[0] = -180.0;
            lon[1] = 180.0;
            double lat_err = 90.0;
            double lon_err = 180.0;

            for (int i = 0; i < geohash.length(); i++) {
                    char c = geohash.charAt(i);
                    int cd = BASE32.indexOf(c);
                    for (int j = 0; j < BITS.length; j++) {
                            int mask = BITS[j];
                            if (is_even) {
                                    lon_err /= 2.0;
                                    refine_interval(lon, cd, mask);
                            } else {
                                    lat_err /= 2.0;
                                    refine_interval(lat, cd, mask);
                            }
                            is_even = !is_even;
                    }
            }
            lat[2] = (lat[0] + lat[1]) / 2.0;
            lon[2] = (lon[0] + lon[1]) / 2.0;

            return new double[][] { lat, lon };
    }

    public static String encode(double latitude, double longitude) {
            boolean is_even = true;
            int i = 0;
            double lat[] = new double[3];
            double lon[] = new double[3];
            int bit = 0;
            int ch = 0;
            int precision = 12;
            String geohash = "";

            lat[0] = -90.0;
            lat[1] = 90.0;
            lon[0] = -180.0;
            lon[1] = 180.0;

            while (geohash.length() < precision) {
                    if (is_even) {
                            double mid = (lon[0] + lon[1]) / 2.0;
                            if (longitude > mid) {
                                    ch |= BITS[bit];
                                    lon[0] = mid;
                            } else {
                                    lon[1] = mid;
                            }
                    } else {
                            double mid = (lat[0] + lat[1]) / 2.0;
                            if (latitude > mid) {
                                    ch |= BITS[bit];
                                    lat[0] = mid;
                            } else {
                                    lat[1] = mid;
                            }
                    }
                    is_even = !is_even;
                    if (bit < 4) {
                            bit++;
                    } else {
                            geohash += BASE32.charAt(ch);
                            bit = 0;
                            ch = 0;
                    }
            }
            return geohash;
    }

    
    
    public static void main(String[] args) { 
    Geohash geohash = new Geohash();
    double lat1=45.81578940;
    double lon1=126.56506400;
    double lat2=45.817047;
    double lon2=126.559509;
    double lat3=45.818645;
    double lon3=126.564262;
    	
    String geocode1=geohash.encode(lat1, lon1).substring(0, 9);
    String geocode2=geohash.encode(lat2, lon2).substring(0, 9);
    String geocode3=geohash.encode(lat3, lon3).substring(0, 9);
    System.out.println("1-龙海-------"+geocode1);
    System.out.println("2-周黑鸭-------"+geocode2);
    System.out.println("3-哈商大-------"+geocode3);
    double d=Distance.GetDistance(lon1,lat1, lon2,lat2);
    double d1=Distance.GetDistance(lon1,lat1, lon3,lat3);
    double d0=Distance.GetDistance(lon3,lat3, lon2,lat2);
    System.out.println(d);
    System.out.println(d0);
    System.out.println(d1);
    
    }
}