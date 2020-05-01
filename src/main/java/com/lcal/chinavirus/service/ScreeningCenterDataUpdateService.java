package com.lcal.chinavirus.service;

import java.util.List;

import com.lcal.chinavirus.entity.ScreeningCenter;

public interface ScreeningCenterDataUpdateService {
    List<ScreeningCenter> loadData();
    void updateData(List<ScreeningCenter> data);
}