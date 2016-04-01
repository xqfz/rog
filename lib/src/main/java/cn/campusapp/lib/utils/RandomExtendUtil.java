package cn.campusapp.lib.utils;

import java.util.Random;

/**
 * Created by kris on 16/3/28.
 */
public class RandomExtendUtil {


    /**
     *
     * @param random
     * @param n > 0
     * @return long [0, n)
     */
    public static long nextLong(Random random, long n){
        return (long) (n * random.nextFloat());
    }


    /**
     *
     * @param random
     * @param n > 0
     * @return byte [0, n)
     */
    public static byte nextByte(Random random, byte n){
        return (byte) random.nextInt(n);
    }

    /**
     *
     * @param random
     * @param n > 0
     * @return short [0, n)
     */
    public static short nextShort(Random random, short n){
        return (short) random.nextInt(n< 0? -n : n);
    }

    /**
     *
     * @param random
     * @param n > 0
     * @return float [0, n)
     */
    public static float nextFloat(Random random, float n){
        return n* random.nextFloat();
    }

    /**
     *
     * @param random
     * @param n > 0
     * @return double [0, n)
     */
    public static double nextDouble(Random random, double n){
        return n* random.nextDouble();
    }



}
