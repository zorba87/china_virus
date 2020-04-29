package com.lcal.chinavirus.service.impl;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collections;
import java.util.List;

import com.lcal.chinavirus.entity.ScreeningCenter;
import com.lcal.chinavirus.service.Covid19ScreeningCenterDataUpdateService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Covid19ScreeningCenterDataUpdateServiceTest {

    @InjectMocks
    private Covid19ScreeningCenterDataUpdateService screeningCenterDataUpdateService;

    @Test
    public void testLoadData() {
        // given

        // when
        List<ScreeningCenter> screeningCenters = null;
        try {
            screeningCenters = screeningCenterDataUpdateService.loadData();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // then
        assertNotNull(screeningCenters);
    }

    @Test
    public void testUpdateData() {
        // given

        // when
        try {
            screeningCenterDataUpdateService.updateData(Collections.emptyList());

            // then
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}