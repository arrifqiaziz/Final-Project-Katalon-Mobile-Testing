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

Mobile.startExistingApplication('com.example.mikebanks.bankscorpfinancial', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Page/btn Create Profile'), 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - First Name'), 'Arrifqi', 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - Last Name'), 'Aziz', 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - Country'), 'Indonesia', 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - Username'), 'arrifqi1', 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - Password'), 'arrifqi', 0)

Mobile.setText(findTestObject('Create Profile Page/Create Profile - Confirm Password'), 'aaa', 0)

Mobile.tap(findTestObject('Create Profile Page/btn Register'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Create Profile Page/Verify Can Not Create Profile'), 1)

