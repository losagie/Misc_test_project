from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
import time

class Test_Trustedweb():
    def test_by_Tag(self):
        web_driver = webdriver.Chrome(service=Service(executable_path=(ChromeDriverManager().install())))
        web_driver.implicitly_wait(5)
        web_driver.get("https://trustedinstitute.com")
        web_driver.maximize_window()
        tagnames =  web_driver.find_elements(By.TAG_NAME, "a")
        print(len(tagnames))
        for i in tagnames:
            if i.text == "Start practicing":
                i.click()
            break
        time.sleep(5)
        web_driver.quit()


DemoTag = Test_Trustedweb()
DemoTag.test_by_Tag()


