package com.dpt.service.impl;

import com.dpt.mapper.OperationMapper;
import com.dpt.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("operationService")
public class OperationServiceImpl implements OperationService {

    private final static Logger logger = LoggerFactory.getLogger(OperationServiceImpl.class);

    @Autowired
    private OperationMapper operationMapper;


}
