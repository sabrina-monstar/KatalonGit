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

WebUI.openBrowser('https://monstar-lab.com/global/contact/')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/select_inquiry'), 'Partnership', false)

WebUI.setText(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/input_Contact us_name'), CustomKeywords.'com.lipsum.getMoreWords'(3))

WebUI.setText(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/input_Name_company'), 'Monstarlab')

//Email
CustomKeywords.'com.lipsum.webEmail'()

WebUI.setText(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/input_Email_phone'), '01718769335')

WebUI.selectOptionByValue(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/select_Monstarlab Office'), 'Berlin', 
    false)

WebUI.click(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/select_Approximate'), 'Below $50,000', 
    false)

WebUI.setText(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/textarea_(optional)_message'), CustomKeywords.'com.lipsum.getMoreParagraph'(
        5))

WebUI.scrollToElement(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/select_Approximate'), 3)

WebUI.click(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/span_browse'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/span_browse'), upload)

WebUI.click(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/button_Send'))

WebUI.delay(3)

WebUI.click(findTestObject('Contact_Us_OR/Page_Contact Us  Monstarlab/input_I agree to Monstar Labs_agree'))

WebUI.closeBrowser()

