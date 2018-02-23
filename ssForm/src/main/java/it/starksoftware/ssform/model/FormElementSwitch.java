package it.starksoftware.ssform.model;

import java.util.ArrayList;
import java.util.List;

import it.starksoftware.ssform.interfaces.SwitchCallBack;

/**
 * Created by Adib on 16-Apr-17.
 */

public class FormElementSwitch implements FormObject {


    // private variables
    private int mTag; // unique tag to identify the object
    private int mType; // type for the form element
    private String mTitle; // title to be shown on left
    private boolean mValue; // value to be shown on right
    private List<String> mOptions; // list of options for single and multi picker
    private List<String> mOptionsSelected; // list of selected options for single and multi picker
    private boolean visibility = true;
    private SwitchCallBack switchCallBack;

    public FormElementSwitch() {
    }

    /**
     * static method to create instance
     * @return
     */
    public static FormElementSwitch createInstance() {
        return new FormElementSwitch();
    }

    public SwitchCallBack getSwitchCallBack() {
        return switchCallBack;
    }

    public FormElementSwitch setCallBack(SwitchCallBack switchCallBack) {
        this.switchCallBack = switchCallBack;
        return this;
    }

    // getters and setters
    public FormElementSwitch setTag(int mTag) {
        this.mTag = mTag;
        return this;
    }

    public FormElementSwitch setType(int mType) {
        this.mType = mType;
        return this;
    }

    public FormElementSwitch setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }

    public FormElementSwitch setValue(boolean mValue) {
        this.mValue = mValue;
        return this;
    }

    public FormElementSwitch setVisibility(boolean visibility) {
        this.visibility = visibility;
        return this;
    }
    public boolean getVisibility() {
        return visibility;
    }

    public FormElementSwitch setOptions(List<String> mOptions) {
        this.mOptions = mOptions;
        return this;
    }

    public FormElementSwitch setOptionsSelected(List<String> mOptionsSelected) {
        this.mOptionsSelected = mOptionsSelected;
        return this;
    }

    public int getTag() {
        return mTag;
    }

    public int getType() {
        return mType;
    }

    public String getTitle() {
        return mTitle;
    }

    public boolean getValue() {
        return mValue;
    }

    public List<String> getOptions() {
        return (mOptions == null) ? new ArrayList<String>() : mOptions;
    }

    public List<String> getOptionsSelected() {
        return (mOptionsSelected == null) ? new ArrayList<String>() : mOptionsSelected;
    }

    @Override
    public boolean isHeader() {
        return false;
    }

    @Override
    public String getElementType() {

        return "Switch";
    }

    @Override
    public String toString() {
        return "TAG: " + String.valueOf(this.mTag) + ", TITLE: " + this.mTitle + ", VALUE: " + this.mValue ;
    }
}
