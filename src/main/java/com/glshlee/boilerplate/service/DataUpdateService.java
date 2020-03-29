package com.glshlee.boilerplate.service;

import com.glshlee.boilerplate.entity.Data;

public interface DataUpdateService {
    Data loadData();
    void updateData(Data data);
}