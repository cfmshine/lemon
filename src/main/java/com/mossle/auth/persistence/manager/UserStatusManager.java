package com.mossle.auth.persistence.manager;

import com.mossle.auth.persistence.domain.UserStatus;

import com.mossle.core.hibernate.HibernateEntityDao;

import org.springframework.stereotype.Service;

@Service
public class UserStatusManager extends HibernateEntityDao<UserStatus> {
}
