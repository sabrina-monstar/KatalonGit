package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class random {

	@Keyword
	def randomName() {
		int RN1
		RN1 = ((Math.random() * 500) as int)
		System.out.println(RN1);
		WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_firstName'), 'Test' + RN1)
		WebUI.delay(03)
	}

	@Keyword
	def randomNumber() {
		int RN2
		RN2 = ((Math.random() * 500) as int)
		System.out.println(RN2);
		WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_phone'), ('018' + RN2) + '657772')
		WebUI.delay(03)
	}

	@Keyword
	def randomEmail() {
		int RN
		RN = ((Math.random() * 500) as int)
		System.out.println(RN);
		WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_Email'), ('John' + RN) + '@test.com')
		WebUI.delay(03)
	}
}
