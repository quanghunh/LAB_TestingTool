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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input'), 'Peter  Crouch')

WebUI.setText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    '')

WebUI.setText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input'), 'Peter  ')

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    'Mac Pe')

WebUI.setEncryptedText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    'iPhlfSdS2+w=')

WebUI.setEncryptedText(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    'iPhlfSdS2+w=')

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/TC03_AddUser(Record)/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

