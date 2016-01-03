package com.intelliarts.conflab.utils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.intelliarts.conflab.utils.ElementLocatorData.ADD_CONFERENCE_BUTTON;
import static com.intelliarts.conflab.utils.ElementLocatorData.CONFERENCE_DESCRIPTION;
import static com.intelliarts.conflab.utils.ElementLocatorData.CONFERENCE_END_DATE;
import static com.intelliarts.conflab.utils.ElementLocatorData.CONFERENCE_NAME;
import static com.intelliarts.conflab.utils.ElementLocatorData.CONFERENCE_START_DATE;
import static com.intelliarts.conflab.utils.ElementLocatorData.OK_BUTTON;
import static com.intelliarts.conflab.utils.ResourcesData.DEPLOYMENT_URL;
import static com.intelliarts.conflab.utils.ResourcesData.EVENTS_URL;

public class ConfLabEvent {
    private String name;
    private String description;
    //TODO: convert to Date
    private String startDate;
    private String endDate;

    public ConfLabEvent(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void addViaWeb() {
        open(DEPLOYMENT_URL + EVENTS_URL);
        $(ADD_CONFERENCE_BUTTON).click();
        $(CONFERENCE_NAME).val(name);
        $(CONFERENCE_DESCRIPTION).val(description);
        $(CONFERENCE_START_DATE).val(startDate);
        $(CONFERENCE_END_DATE).val(endDate);
        $(OK_BUTTON).click();
    }
}