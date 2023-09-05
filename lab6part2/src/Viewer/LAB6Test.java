/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author DELL1
 *
 */
public class LAB6Test {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        CompanyManagement companyManagement = new CompanyManagement() {
            @Override
            public void excute(int n) {

            }
        };
        companyManagement.cusMenu();
    }
}
