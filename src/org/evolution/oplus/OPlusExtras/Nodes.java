/*
 * Copyright (C) 2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.oplus.OPlusExtras;

import android.content.Context;

import org.evolution.oplus.OPlusExtras.R;
import org.evolution.oplus.OPlusExtras.utils.Utils;

public final class Nodes {
    private Nodes() {
    }

    // MSM touchboost switch
    public static String nodeTouchboost(Context context) {
        return Utils.getNode(context, R.string.node_touchboost_switch);
    }

    // Anti-flicker switch
    public static String nodeAntiFlicker(Context context) {
        return Utils.getNode(context, R.string.node_antiflicker_switch);
    }

   // High brightness mode switch
    public static String nodeHBM(Context context) {
        return Utils.getNode(context, R.string.node_hbm_switch);
    }

    // Keep PCC enabled switch
    public static String nodeKeepPCC(Context context) {
        return Utils.getNode(context, R.string.node_keep_pcc_switch);
    }

    // Maximum brightness preference
    public static String nodeMaxBrightness(Context context) {
        return Utils.getNode(context, R.string.node_max_brightness_preference);
    }

    // Fsync switch
    public static String nodeFSync(Context context) {
        return Utils.getNode(context, R.string.node_fsync_switch);
    }

    // Adrenoboost preference
    public static String nodeAdrenoboost(Context context) {
        return Utils.getNode(context, R.string.node_adrenoboost_preference);
    }

    // Powershare switch
    public static String nodePowershare(Context context) {
        return Utils.getNode(context, R.string.node_powershare_switch);
    }

    // OEM wireless charger quiet mode switch
    public static String nodeQuietMode(Context context) {
        return Utils.getNode(context, R.string.node_quiet_mode_switch);
    }

    // Mic gain preference
    public static String nodeMicGain(Context context) {
        return Utils.getNode(context, R.string.node_microphone_gain_preference);
    }

    // Speaker gain preference
    public static String nodeSpeakerGain(Context context) {
        return Utils.getNode(context, R.string.node_speaker_gain_preference);
    }

    // Edge limit switch
    public static String nodeEdgeLimit(Context context) {
        return Utils.getNode(context, R.string.node_edge_limit_switch);
    }

    // High touch polling rate switch
    public static String nodeHighTouchPollingRate(Context context) {
        return Utils.getNode(context, R.string.node_high_touch_polling_rate_switch);
    }

    // USB 2.0 fast charge switch
    public static String nodeUSB2FastCharge(Context context) {
        return Utils.getNode(context, R.string.node_usb2_fast_charge_switch);
    }

    // USB-OTG switch
    public static String nodeOTG(Context context) {
        return Utils.getNode(context, R.string.node_usb_otg_switch);
    }

    // Vibrator strength preference
    public static String nodeVibratorStrength(Context context) {
        return Utils.getNode(context, R.string.node_vibrator_strength_preference);
    }
}
