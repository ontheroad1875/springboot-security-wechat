package com.jwcq.service;

import com.jwcq.user.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional("secondTransactionManager")
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;
}