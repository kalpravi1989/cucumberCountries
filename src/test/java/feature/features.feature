
Feature: Print the country details from list 

  
  Scenario: Print the country details from list using random number 
    Given The user three 
    |country| China, Egypt, France, Germany, India, Japan, Kenya, Mexico, United Kingdom, United States|
    |capital|Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi, Mexico City, London, Washington D.C.|
    |language|Chinese, Arabic, French, German, Hindi, Japanese, Swahili, Spanish, English, English|
    And choose random number
   Then print  the country details 
  

  