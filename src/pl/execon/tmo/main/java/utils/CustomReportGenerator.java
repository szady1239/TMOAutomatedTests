package pl.execon.tmo.main.java.utils;

import org.testng.ISuite;

import java.util.List;

public interface CustomReportGenerator {

  /**
   * Method generates testing report in string using list of suites
   * 
   * @param List<ISuite> suites executed in the test run
   * 
   * @return report content in String
   */
  String generateStringReport(List<ISuite> suites);

  /**
   * Method generates testing report using list of suites
   * 
   * @param List<ISuite> suites executed in the test run, String filename name of destination file
   * 
   * @return report content in String
   */
  void generateFileReport(List<ISuite> suites, String fileName);

}
