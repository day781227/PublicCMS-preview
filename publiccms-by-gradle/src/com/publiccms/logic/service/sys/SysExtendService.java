package com.publiccms.logic.service.sys;

// Generated 2016-3-2 13:39:44 by com.sanluan.common.source.SourceMaker

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.publiccms.entities.sys.SysExtend;
import com.publiccms.logic.dao.sys.SysExtendDao;
import com.sanluan.common.base.BaseService;

@Service
@Transactional
public class SysExtendService extends BaseService<SysExtend> {

    @Autowired
    private SysExtendDao dao;
}