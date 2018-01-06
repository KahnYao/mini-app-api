package com.dpt.service.impl;

import com.dpt.mapper.DepositMapper;
import com.dpt.service.DepositService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("depositService")
public class DepositServiceImpl implements DepositService {

    private final static Logger logger = LoggerFactory.getLogger(DepositServiceImpl.class);

    @Autowired
    private DepositMapper depositMapper;
}
