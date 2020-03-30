package com.lcal.chinavirus.service;

import com.lcal.chinavirus.entity.Data;

public interface DataUpdateService {
    Data loadData();
    void updateData(Data data);
}