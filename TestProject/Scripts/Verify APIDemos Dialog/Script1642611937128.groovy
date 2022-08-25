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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

//def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())
//Mobile.startApplication(appPath, false)

Mobile.startApplication('test', true)

//if (Mobile.verifyElementExist(findTestObject('Object Repository/APIDemos/android.widget.TextView - Choose what to allow API Demos to access'), 10, FailureHandling.OPTIONAL)) {
//	Mobile.tap(findTestObject('Object Repository/APIDemos/android.widget.Button - Continue'), 0)
//}
//
//if (Mobile.verifyElementExist(findTestObject('Object Repository/APIDemos/android.widget.TextView - This app was built for an older version of Android and may not work properly. Try checking for updates, or contact the developer'), 10, FailureHandling.OPTIONAL)) {
//	Mobile.tap(findTestObject('Object Repository/APIDemos/android.widget.Button - OK'), 0)
//}

Mobile.tap(findTestObject('Object Repository/APIDemos/android.widget.TextView - App'), 0)

Mobile.tap(findTestObject('Object Repository/APIDemos/android.widget.TextView - Activity'), 0)

Mobile.tap(findTestObject('Object Repository/APIDemos/android.widget.TextView - Custom Dialog'), 0)

//def message = Mobile.getText(findTestObject('Object Repository/APIDemos/android.widget.TextView - Example of how you can use a custom Theme.Dialog theme to make an activity that looks like a customized dialog, here with an ugly frame'), 0)
//
//Mobile.verifyEqual(message, 'Example of how you can use a custom Theme.Dialog theme to make an activity that looks like a customized dialog, here with an ugly frame.')

Mobile.closeApplication()

