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

WebUI.callTestCase(findTestCase('Register, Login and Logout/Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sidemenu/btn Sidemenu'), 0)

Mobile.tap(findTestObject('Sidemenu/Sidemenu - Make a Transfer'), 0)

Mobile.tap(findTestObject('Transaction/Transfer/Select Sending'), 0)

Mobile.setText(findTestObject('Transaction/Transfer/Input Transfer Amount'), '5000', 0)

Mobile.tap(findTestObject('Transaction/Transfer/Select Receiving'), 0)

Mobile.tap(findTestObject('Transaction/Transfer/btn Confirm Transfer'), 0)

Mobile.verifyElementExist(findTestObject('Transaction/Transfer/Verify Transfer Success'), 1)

