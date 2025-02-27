package xzr.konabess;


import android.app.Activity;

public class ChipInfo {
    public enum type {
        kona,
        kona_singleBin,
        msmnile,
        msmnile_singleBin,
        lahaina,
        lahaina_singleBin,
        lito_v1, lito_v2,
        lagoon,
        shima,
        yupik,
        waipio_singleBin,
        cape_singleBin,
        kalama,
        diwali,
        ukee_singleBin,
        unknown
    }

    public static int getMaxTableLevels(type type) {
        if (type == ChipInfo.type.cape_singleBin || type == ChipInfo.type.waipio_singleBin)
            return 16;
        return 11;
    }

    public static boolean shouldIgnoreVoltTable(type type) {
        return type == ChipInfo.type.lahaina || type == ChipInfo.type.lahaina_singleBin
                || type == ChipInfo.type.shima || type == ChipInfo.type.yupik
                || type == ChipInfo.type.waipio_singleBin || type == ChipInfo.type.cape_singleBin
                || type == ChipInfo.type.kalama || type == ChipInfo.type.diwali
                || type == ChipInfo.type.ukee_singleBin;
    }

    public static boolean checkChipGeneral(type input) {
        type now = which;
        if (now == type.lito_v2)
            now = type.lito_v1;
        if (input == type.lito_v2)
            input = type.lito_v1;
        return input == now;
    }

    public static String name2chipdesc(String name, Activity activity) {
        type t = type.valueOf(name);
        return name2chipdesc(t, activity);
    }

    public static String name2chipdesc(type t, Activity activity) {
        switch (t) {
            case kona:
                return activity.getResources().getString(R.string.sdm865_series);
            case kona_singleBin:
                return activity.getResources().getString(R.string.sdm865_singlebin);
            case msmnile:
                return activity.getResources().getString(R.string.sdm855_series);
            case msmnile_singleBin:
                return activity.getResources().getString(R.string.sdm855_singlebin);
            case lahaina:
                return activity.getResources().getString(R.string.sdm888);
            case lahaina_singleBin:
                return activity.getResources().getString(R.string.sdm888_singlebin);
            case lito_v1:
                return activity.getResources().getString(R.string.lito_v1_series);
            case lito_v2:
                return activity.getResources().getString(R.string.lito_v2_series);
            case lagoon:
                return activity.getResources().getString(R.string.lagoon_series);
            case shima:
                return activity.getResources().getString(R.string.sd780g);
            case yupik:
                return activity.getResources().getString(R.string.sd778g);
            case waipio_singleBin:
                return activity.getResources().getString(R.string.sd8g1_singlebin);
            case cape_singleBin:
                return activity.getResources().getString(R.string.sd8g1p_singlebin);
            case kalama:
                return activity.getResources().getString(R.string.sd8g2);
            case diwali:
                return activity.getResources().getString(R.string.sd7g1);
            case ukee_singleBin:
                return activity.getResources().getString(R.string.sd7g2);
        }
        return activity.getResources().getString(R.string.unknown);
    }

    public static type which;

    public static class rpmh_levels {
        public static int[] levels() {
            if (ChipInfo.which == type.kona || ChipInfo.which == type.kona_singleBin)
                return rpmh_levels_kona.levels;
            else if (ChipInfo.which == type.msmnile || ChipInfo.which == type.msmnile_singleBin)
                return rpmh_levels_msmnile.levels;
            else if (ChipInfo.which == type.lahaina)
                return rpmh_levels_lahaina.levels;
            else if (ChipInfo.which == type.lahaina_singleBin)
                return rpmh_levels_lahaina_singleBin.levels;
            else if (ChipInfo.which == type.lito_v1 || ChipInfo.which == type.lito_v2)
                return rpmh_levels_lito.levels;
            else if (ChipInfo.which == type.lagoon)
                return rpmh_levels_lagoon.levels;
            else if (ChipInfo.which == type.shima)
                return rpmh_levels_shima.levels;
            else if (ChipInfo.which == type.yupik)
                return rpmh_levels_yupik.levels;
            else if (ChipInfo.which == type.waipio_singleBin)
                return rpmh_levels_waipio.levels;
            else if (ChipInfo.which == type.cape_singleBin)
                return rpmh_levels_cape.levels;
            else if (ChipInfo.which == type.kalama)
                return rpmh_levels_kalama.levels;
            else if (ChipInfo.which == type.diwali)
                return rpmh_levels_diwali.levels;
            else if (ChipInfo.which == type.ukee_singleBin)
                return rpmh_levels_ukee.levels;

            return new int[]{};
        }

        public static String[] level_str() {
            if (ChipInfo.which == type.kona || ChipInfo.which == type.kona_singleBin)
                return rpmh_levels_kona.level_str;
            else if (ChipInfo.which == type.msmnile || ChipInfo.which == type.msmnile_singleBin)
                return rpmh_levels_msmnile.level_str;
            else if (ChipInfo.which == type.lahaina)
                return rpmh_levels_lahaina.level_str;
            else if (ChipInfo.which == type.lahaina_singleBin)
                return rpmh_levels_lahaina_singleBin.level_str;
            else if (ChipInfo.which == type.lito_v1 || ChipInfo.which == type.lito_v2)
                return rpmh_levels_lito.level_str;
            else if (ChipInfo.which == type.lagoon)
                return rpmh_levels_lagoon.level_str;
            else if (ChipInfo.which == type.shima)
                return rpmh_levels_shima.level_str;
            else if (ChipInfo.which == type.yupik)
                return rpmh_levels_yupik.level_str;
            else if (ChipInfo.which == type.waipio_singleBin)
                return rpmh_levels_waipio.level_str;
            else if (ChipInfo.which == type.cape_singleBin)
                return rpmh_levels_cape.level_str;
            else if (ChipInfo.which == type.kalama)
                return rpmh_levels_kalama.level_str;
            else if (ChipInfo.which == type.diwali)
                return rpmh_levels_diwali.level_str;
            else if (ChipInfo.which == type.ukee_singleBin)
                return rpmh_levels_ukee.level_str;

            return new String[]{};
        }
    }

    private static class rpmh_levels_kona {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_msmnile {
        private static final int RPMH_REGULATOR_LEVEL_OFFSET = 1;
        public static final int[] levels = {
                16 + RPMH_REGULATOR_LEVEL_OFFSET,
                48 + RPMH_REGULATOR_LEVEL_OFFSET,
                52 + RPMH_REGULATOR_LEVEL_OFFSET,
                56 + RPMH_REGULATOR_LEVEL_OFFSET,
                60 + RPMH_REGULATOR_LEVEL_OFFSET,
                64 + RPMH_REGULATOR_LEVEL_OFFSET,
                72 + RPMH_REGULATOR_LEVEL_OFFSET,
                76 + RPMH_REGULATOR_LEVEL_OFFSET,
                80 + RPMH_REGULATOR_LEVEL_OFFSET,
                88 + RPMH_REGULATOR_LEVEL_OFFSET,
                96 + RPMH_REGULATOR_LEVEL_OFFSET,
                112 + RPMH_REGULATOR_LEVEL_OFFSET,
                128 + RPMH_REGULATOR_LEVEL_OFFSET,
                144 + RPMH_REGULATOR_LEVEL_OFFSET,
                168 + RPMH_REGULATOR_LEVEL_OFFSET,
                192 + RPMH_REGULATOR_LEVEL_OFFSET,
                208 + RPMH_REGULATOR_LEVEL_OFFSET,
                224 + RPMH_REGULATOR_LEVEL_OFFSET,
                236 + RPMH_REGULATOR_LEVEL_OFFSET,
                248 + RPMH_REGULATOR_LEVEL_OFFSET,
                256 + RPMH_REGULATOR_LEVEL_OFFSET,
                288 + RPMH_REGULATOR_LEVEL_OFFSET,
                320 + RPMH_REGULATOR_LEVEL_OFFSET,
                336 + RPMH_REGULATOR_LEVEL_OFFSET,
                352 + RPMH_REGULATOR_LEVEL_OFFSET,
                384 + RPMH_REGULATOR_LEVEL_OFFSET,
                400 + RPMH_REGULATOR_LEVEL_OFFSET,
                416 + RPMH_REGULATOR_LEVEL_OFFSET
        };
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_lahaina {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416, 432, 448, 464};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1",
                "432-TURBO_L2",
                "448-SUPER_TURBO",
                "464-SUPER_TURBO_NO_CPR"
        };
    }

    private static class rpmh_levels_lahaina_singleBin {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_lito {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_lagoon {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_shima {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_yupik {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_waipio {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_cape {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_diwali {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_ukee {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1"
        };
    }

    private static class rpmh_levels_kalama {
        public static final int[] levels = {16, 48, 52, 56, 60, 64, 72, 76, 80, 88, 96, 112, 128, 144, 168, 192, 208, 224, 236, 248, 256, 288, 320,
                336, 352, 384, 400, 416, 432, 448, 464, 480};
        public static final String[] level_str = {
                "16-RETENTION",
                "48-MIN_SVS",
                "52-LOW_SVS_D2",
                "56-LOW_SVS_D1",
                "60-LOW_SVS_D0",
                "64-LOW_SVS",
                "72-LOW_SVS_P1",
                "76-LOW_SVS_P2",
                "80-LOW_SVS_L1",
                "88",
                "96-LOW_SVS_L2",
                "112",
                "128-SVS",
                "144-SVS_L0",
                "168",
                "192-SVS_L1",
                "208",
                "224-SVS_L2",
                "236",
                "248",
                "256-NOM",
                "288-NOM_L0",
                "320-NOM_L1",
                "336-NOM_L2",
                "352-NOM_L3",
                "384-TURBO",
                "400-TURBO_L0",
                "416-TURBO_L1",
                "432-TURBO_L2",
                "448-TURBO_L3",
                "464-SUPER_TURBO",
                "480-SUPER_TURBO_NO_CPR"
        };
    }

}
