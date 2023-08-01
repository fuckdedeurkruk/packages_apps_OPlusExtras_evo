/*
 * Copyright (C) 2018-2022 crDroid Android Project
 *               2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.oplus.OPlusExtras;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

import org.evolution.oplus.OPlusExtras.doze.DozeUtils;
import org.evolution.oplus.OPlusExtras.kcal.Kcal;
import org.evolution.oplus.OPlusExtras.touch.TouchscreenGestureSettings;

public class Startup extends BroadcastReceiver {

    private static final String TAG = Startup.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
            // Main
            OPlusExtras.restoreSliderStates(context);
            OPlusExtras.restoreTouchboostSetting(context);
            OPlusExtras.restoreAntiFlickerSetting(context);
            OPlusExtras.restoreHBMSetting(context);
            OPlusExtras.restoreMaxBrightnessSetting(context);
            OPlusExtras.restoreKeepPCCSetting(context);
            OPlusExtras.restoreFSyncSetting(context);
            OPlusExtras.restoreAdrenoboostSetting(context);
            OPlusExtras.restorePowershareSetting(context);
            OPlusExtras.restoreQuietModeSetting(context);
            OPlusExtras.restoreMicGainSetting(context);
            OPlusExtras.restoreSpeakerGainSetting(context);
            OPlusExtras.restoreEdgeLimitSetting(context);
            OPlusExtras.restoreHighTouchPollingRateSetting(context);
            OPlusExtras.restoreFastChargeSetting(context);
            OPlusExtras.restoreOTGSetting(context);
            OPlusExtras.restoreVibratorStrengthSetting(context);
            // Doze
            DozeUtils.checkDozeService(context);
            // Kcal
            Kcal.restoreRedSetting(context);
            Kcal.restoreGreenSetting(context);
            Kcal.restoreBlueSetting(context);
            Kcal.restoreSaturationSetting(context);
            Kcal.restoreContrastSetting(context);
            Kcal.restoreHueSetting(context);
            Kcal.restoreValueSetting(context);
            // Touchgestures
            TouchscreenGestureSettings.MainSettingsFragment.restoreTouchscreenGestureStates(context);
    }
}
