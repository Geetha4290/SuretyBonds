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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Find A bond/Login Page/Username'), GlobalVariable.UN)

WebUI.setText(findTestObject('Find A bond/Login Page/Password'), GlobalVariable.PW)

WebUI.click(findTestObject('Find A bond/Login Page/Agree Btn'))

WebUI.verifyElementText(findTestObject('Find A bond/HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('Find A bond/HomePage/Commercial bonds left menu'))

WebUI.click(findTestObject('Find A bond/HomePage/Bonds left menu'))

WebUI.click(findTestObject('Find A bond/HomePage/FindABond'))

WebUI.selectOptionByValue(findTestObject('Find A bond/HomePage/Bond No DD'), 'Bond Number', false)

WebUI.setText(findTestObject('Find A bond/HomePage/Bond Number Input'), '1697178')

WebUI.click(findTestObject('Find A bond/HomePage/Submit Btn'))

WebUI.verifyElementText(findTestObject('Find A bond/View Bond/ViewBondText'), 'View Bond')

WebUI.click(findTestObject('Find A bond/View Bond/ExitBondBtn'))

WebUI.verifyElementText(findTestObject('Find A bond/HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('Find A bond/HomePage/Logout'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

