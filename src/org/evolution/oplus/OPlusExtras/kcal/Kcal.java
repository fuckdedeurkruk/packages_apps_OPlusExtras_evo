/*
 * Copyright (C) 2018-2022 crDroid Android Project
 *               2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.oplus.OPlusExtras.kcal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceManager;
import androidx.preference.Preference;

import org.evolution.oplus.OPlusExtras.CustomSeekBarPreference;
import org.evolution.oplus.OPlusExtras.R;
import org.evolution.oplus.OPlusExtras.utils.Utils;

public class Kcal extends PreferenceFragment
        implements Preference.OnPreferenceChangeListener {
    private static final String TAG = Kcal.class.getSimpleName();

    // Red preference
    private static final String KEY_RED = "red";
    private static final String RED_DEFAULT = "256";
    private CustomSeekBarPreference mRedPreference;

    // Green preference
    private static final String KEY_GREEN = "green";
    private static final String GREEN_DEFAULT = "256";
    private CustomSeekBarPreference mGreenPreference;

    // Blue preference
    private static final String KEY_BLUE = "blue";
    private static final String BLUE_DEFAULT = "256";
    private CustomSeekBarPreference mBluePreference;

    // Saturation preference
    private static final String KEY_SATURATION = "saturation";
    private static final String SATURATION_DEFAULT = "255";
    private CustomSeekBarPreference mSaturationPreference;

    // Contrast preference
    private static final String KEY_CONTRAST = "contrast";
    private static final String CONTRAST_DEFAULT = "255";
    private CustomSeekBarPreference mContrastPreference;

    // Hue preference
    private static final String KEY_HUE = "hue";
    private static final String HUE_DEFAULT = "0";
    private CustomSeekBarPreference mHuePreference;

    // Value preference
    private static final String KEY_VALUE = "value";
    private static final String VALUE_DEFAULT = "255";
    private CustomSeekBarPreference mValuePreference;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.kcal);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        Context context = getContext();

        // Red preference
        mRedPreference =  (CustomSeekBarPreference) findPreference(KEY_RED);
        if (Utils.isFileWritable(KcalNodes.nodeRed(context))) {
            mRedPreference.setValue(sharedPrefs.getInt(KEY_RED,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeRed(context), RED_DEFAULT))));
            mRedPreference.setOnPreferenceChangeListener(this);
        } else {
            mRedPreference.setEnabled(false);
        }

        // Green preference
        mGreenPreference =  (CustomSeekBarPreference) findPreference(KEY_GREEN);
        if (Utils.isFileWritable(KcalNodes.nodeGreen(context))) {
            mGreenPreference.setValue(sharedPrefs.getInt(KEY_GREEN,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeGreen(context), GREEN_DEFAULT))));
            mGreenPreference.setOnPreferenceChangeListener(this);
        } else {
            mGreenPreference.setEnabled(false);
        }

        // Blue preference
        mBluePreference =  (CustomSeekBarPreference) findPreference(KEY_BLUE);
        if (Utils.isFileWritable(KcalNodes.nodeBlue(context))) {
            mBluePreference.setValue(sharedPrefs.getInt(KEY_BLUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeBlue(context), BLUE_DEFAULT))));
            mBluePreference.setOnPreferenceChangeListener(this);
        } else {
            mBluePreference.setEnabled(false);
        }

        // Saturation preference
        mSaturationPreference =  (CustomSeekBarPreference) findPreference(KEY_SATURATION);
        if (Utils.isFileWritable(KcalNodes.nodeSaturation(context))) {
            mSaturationPreference.setValue(sharedPrefs.getInt(KEY_SATURATION,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeSaturation(context), SATURATION_DEFAULT))));
            mSaturationPreference.setOnPreferenceChangeListener(this);
        } else {
            mSaturationPreference.setEnabled(false);
        }

        // Contrast preference
        mContrastPreference =  (CustomSeekBarPreference) findPreference(KEY_CONTRAST);
        if (Utils.isFileWritable(KcalNodes.nodeContrast(context))) {
            mContrastPreference.setValue(sharedPrefs.getInt(KEY_CONTRAST,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeContrast(context), CONTRAST_DEFAULT))));
            mContrastPreference.setOnPreferenceChangeListener(this);
        } else {
            mContrastPreference.setEnabled(false);
        }

        // Hue preference
        mHuePreference =  (CustomSeekBarPreference) findPreference(KEY_HUE);
        if (Utils.isFileWritable(KcalNodes.nodeHue(context))) {
            mHuePreference.setValue(sharedPrefs.getInt(KEY_HUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeHue(context), HUE_DEFAULT))));
            mHuePreference.setOnPreferenceChangeListener(this);
        } else {
            mHuePreference.setEnabled(false);
        }

        // Value preference
        mValuePreference =  (CustomSeekBarPreference) findPreference(KEY_VALUE);
        if (Utils.isFileWritable(KcalNodes.nodeValue(context))) {
            mValuePreference.setValue(sharedPrefs.getInt(KEY_VALUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeValue(context), VALUE_DEFAULT))));
            mValuePreference.setOnPreferenceChangeListener(this);
        } else {
            mValuePreference.setEnabled(false);
        }
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        // Red preference
        if (preference == mRedPreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_RED, value).commit();
            Utils.writeValue(KcalNodes.nodeRed(getContext()), String.valueOf(value));
            return true;
        // Green preference
        } else if (preference == mGreenPreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_GREEN, value).commit();
            Utils.writeValue(KcalNodes.nodeGreen(getContext()), String.valueOf(value));
            return true;
        // Blue preference
        } else if (preference == mBluePreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_BLUE, value).commit();
            Utils.writeValue(KcalNodes.nodeBlue(getContext()), String.valueOf(value));
            return true;
        // Saturation preference
        } else if (preference == mSaturationPreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_SATURATION, value).commit();
            Utils.writeValue(KcalNodes.nodeSaturation(getContext()), String.valueOf(value));
            return true;
        // Contrast preference
        } else if (preference == mContrastPreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_CONTRAST, value).commit();
            Utils.writeValue(KcalNodes.nodeContrast(getContext()), String.valueOf(value));
            return true;
        // Hue preference
        } else if (preference == mHuePreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_HUE, value).commit();
            Utils.writeValue(KcalNodes.nodeHue(getContext()), String.valueOf(value));
            return true;
        // Value preference
        } else if (preference == mValuePreference) {
            int value = Integer.parseInt(newValue.toString());
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            sharedPrefs.edit().putInt(KEY_VALUE, value).commit();
            Utils.writeValue(KcalNodes.nodeValue(getContext()), String.valueOf(value));
            return true;
        }

        return false;
    }

    // Red preference
    public static void restoreRedSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeRed(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_RED,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeRed(context), RED_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeRed(context), String.valueOf(value));
        }
    }

    // Green preference
    public static void restoreGreenSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeGreen(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_GREEN,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeGreen(context), GREEN_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeGreen(context), String.valueOf(value));
        }
    }

    // Blue preference
    public static void restoreBlueSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeBlue(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_BLUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeBlue(context), BLUE_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeBlue(context), String.valueOf(value));
        }
    }

    // Saturation preference
    public static void restoreSaturationSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeSaturation(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_SATURATION,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeSaturation(context), SATURATION_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeSaturation(context), String.valueOf(value));
        }
    }

    // Contrast preference
    public static void restoreContrastSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeContrast(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_CONTRAST,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeContrast(context), CONTRAST_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeContrast(context), String.valueOf(value));
        }
    }

    // Hue preference
    public static void restoreHueSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeHue(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_HUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeHue(context), HUE_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeHue(context), String.valueOf(value));
        }
    }

    // Value preference
    public static void restoreValueSetting(Context context) {
        if (Utils.isFileWritable(KcalNodes.nodeValue(context))) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            int value = sharedPrefs.getInt(KEY_VALUE,
                Integer.parseInt(Utils.getFileValue(KcalNodes.nodeValue(context), VALUE_DEFAULT)));
            Utils.writeValue(KcalNodes.nodeValue(context), String.valueOf(value));
        }
    }
}
