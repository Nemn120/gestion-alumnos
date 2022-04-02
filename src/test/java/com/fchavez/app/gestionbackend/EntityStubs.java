package com.fchavez.app.gestionbackend;

import com.fchavez.app.gestionbackend.domain.RegisterCoursesDTO;

import java.io.IOException;

public final class EntityStubs {

    private static final EntityStubs INSTANCE = new EntityStubs();
    private ObjectMapperHelper objectMapperHelper = ObjectMapperHelper.getInstance();

    private EntityStubs() {
    }

    public static EntityStubs getInstance() {
        return INSTANCE;
    }

    public RegisterCoursesDTO getRegisterCoursesDTO() throws IOException {
        return objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().getResourceAsStream(
                "mock/inputRegisterCoursesDTO.json"), RegisterCoursesDTO.class);
    }
}
