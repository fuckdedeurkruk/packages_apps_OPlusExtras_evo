/*
 * Copyright (C) 2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.oplus.OPlusExtras.kcal;

import android.content.Context;

import org.evolution.oplus.OPlusExtras.R;
import org.evolution.oplus.OPlusExtras.utils.Utils;

public final class KcalNodes {
    private KcalNodes() {
    }

    // Red preference
    public static String nodeRed(Context context) {
        return Utils.getNode(context, R.string.node_red_preference);
    }

    // Green preference
    public static String nodeGreen(Context context) {
        return Utils.getNode(context, R.string.node_green_preference);
    }

    // Blue preference
    public static String nodeBlue(Context context) {
        return Utils.getNode(context, R.string.node_blue_preference);
    }

    // Saturation preference
    public static String nodeSaturation(Context context) {
        return Utils.getNode(context, R.string.node_saturation_preference);
    }

    // Contrast preference
    public static String nodeContrast(Context context) {
        return Utils.getNode(context, R.string.node_contrast_preference);
    }

    // Hue preference
    public static String nodeHue(Context context) {
        return Utils.getNode(context, R.string.node_hue_preference);
    }

    // Value preference
    public static String nodeValue(Context context) {
        return Utils.getNode(context, R.string.node_value_preference);
    }
}
