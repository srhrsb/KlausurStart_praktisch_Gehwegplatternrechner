package com.brh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogDAOTest {

    private final LogDAO logDao = new LogDAO();
    @Test
    void getLogList() {
        var list = logDao.getLogList();
        assertNotNull(list, "Liste ist ungültig" );

        //testen ob die Liste gefüllt werden kann

    }


    @Test
    void addCalcToLog(){
        var oldSize= logDao.getLogList().size();
        logDao.addCalcToLog(12,1,1);
        var newSize= logDao.getLogList().size();

        assertNotEquals( oldSize,newSize, "Liste nicht erweiterbar" );
    }
}