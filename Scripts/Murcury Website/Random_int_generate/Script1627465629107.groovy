import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser(url)

//Random_name
int RN1

RN1 = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_firstName'), 'Test' + RN1)



WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_lastName'), 'User')

//Random_number
int RN2

RN2 = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_phone'), ('018' + RN2) + '657772')

//Random_email
int RN

RN = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('OR1/Page_Register Mercury Tours/input_Email'), ('John' + RN) + '@test.com')

//submit
WebUI.click(findTestObject('Page_Register Mercury Tours/input_submit'))

WebUI.waitForPageLoad(10)

WebUI.closeBrowser()

