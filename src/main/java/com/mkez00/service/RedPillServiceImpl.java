package com.mkez00.service;

import com.mkez00.model.Pill;
import org.springframework.stereotype.Service;

/**
 * Created by michaelkezele on 2017-10-30.
 */
@Service("RedPillServiceImpl")
public class RedPillServiceImpl implements PillService {
    @Override
    public Pill getPill() {
        return new Pill("RED");
    }
}
