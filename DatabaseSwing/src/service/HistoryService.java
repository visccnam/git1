/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import JDBCConnection.HistoryManagement;
import java.util.List;
import model.History;

/**
 *
 * @author Admin
 */
public class HistoryService {
    HistoryManagement historyManagement=new HistoryManagement();
    public List<History> getallHistory(){
        return historyManagement.getallHistory();
    }
    public void addHistory(History h){
        historyManagement.addHistory(h);
    }
    public String getTong(){
        return historyManagement.getTonggd();
    }
}
