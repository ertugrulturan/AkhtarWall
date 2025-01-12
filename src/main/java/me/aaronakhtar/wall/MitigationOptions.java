package me.aaronakhtar.wall;

import java.io.File;

public class MitigationOptions {
                                                        // both triggers must be hit in order for mitigation to trigger
    public static long    ppsCap = 5000;    // pps to be reached for mitigation
    public static double  mbpsCap = 5;      // mbps to be reached for mitigation

    public static int
            maxConcurrentHandles = 0,
            mitigationLengthInSeconds = 300;

    public static final String LOG_DIRECTORY() {
        final String s = "./AkhtarWall/logs";
        final File f = new File(s);
        if (!f.isDirectory()) f.mkdirs();
        return s;
    }


}
