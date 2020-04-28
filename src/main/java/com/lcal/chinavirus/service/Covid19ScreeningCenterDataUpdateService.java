package com.lcal.chinavirus.service;

import java.io.File;
import java.util.Collections;
import java.util.List;

import com.lcal.chinavirus.entity.ScreeningCenter;

public class Covid19ScreeningCenterDataUpdateService implements ScreeningCenterDataUpdateService {

    @Override
    public List<ScreeningCenter> loadData() {
        // TODO download file

        // TODO return
        return getScreeningCenters(null);
    }

    @Override
    public void updateData(List<ScreeningCenter> datas) {
        // TODO impl

    }

    private List<ScreeningCenter> getScreeningCenters(File file) {
        
        return Collections.emptyList();
    }
}