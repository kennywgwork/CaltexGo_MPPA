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
import groovy.json.JsonSlurper as JsonSlurper

AddResponse = WS.sendRequest(findTestObject('FuelingServiceProviderCRUD/AddFuelingServiceProvider', [('name') : name]))

WS.verifyResponseStatusCode(AddResponse, 200)

println(AddResponse.getResponseText())

def jsonS = new JsonSlurper()

def jsonResponse = jsonS.parseText(AddResponse.getResponseText())

ID = jsonResponse.id

WS.verifyElementPropertyValue(AddResponse, 'name', name)

GetResponse = WS.sendRequest(findTestObject('FuelingServiceProviderCRUD/GetSpecificFuelingServiceProvider', [('id') : ID]))

println(GetResponse.getResponseText())

WS.verifyResponseStatusCode(GetResponse, 200)

