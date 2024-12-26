import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

#This is a sign-up page functionality test

class Trusted_Web_Test():
    def trusted_test(self):
        web_driver = webdriver.Chrome(service=Service(executable_path=ChromeDriverManager().install()))
        web_driver.implicitly_wait(10)
        web_driver.get('https://trustedinstitute.com')
        web_driver.maximize_window()
        web_driver.find_element(By.XPATH, "//a[normalize-space()='Get Started']").click()
        web_driver.find_element(By.XPATH, "//a[normalize-space()='Register']").click()
        web_driver.find_element(By.ID, "id_first_name").send_keys('lawrence')
        web_driver.find_element(By.ID, "id_last_name").send_keys('Gary')
        web_driver.find_element(By.NAME, "email").send_keys('mrechconstruct2@co.site')
        web_driver.find_element(By.XPATH, "//button[@id='register_submit']").click()
        web_driver.switch_to.new_window("tab")
        web_driver.get("https://yahoo.com")
        winhand = web_driver.current_window_handle
        winhands = web_driver.window_handles
        print(winhands[0])
        print(winhand)
        time.sleep(5)
        web_driver.quit()


Mytest = Trusted_Web_Test()
Mytest.trusted_test()

