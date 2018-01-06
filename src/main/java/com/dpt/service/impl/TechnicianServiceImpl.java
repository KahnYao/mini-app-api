package com.dpt.service.impl;

import com.dpt.mapper.TechnicianMapper;
import com.dpt.model.Technician;
import com.dpt.service.TechnicianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("technicianService")
public class TechnicianServiceImpl implements TechnicianService {

    private final static Logger logger = LoggerFactory.getLogger(TechnicianServiceImpl.class);

    @Autowired
    private TechnicianMapper technicianMapper;

    @Override
    public int insertTechnician(Technician technician) throws Exception {
        return this.technicianMapper.insert(technician);
    }

    @Override
    public Technician getTechnicianById(int id) {
        return this.technicianMapper.getTechnicianById(id);
    }

    @Override
    public List<Technician> getTechnicians() {
        return this.technicianMapper.getTechnicians();
    }

}
