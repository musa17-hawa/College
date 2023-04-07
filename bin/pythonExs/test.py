from datetime import date

today = date.today()


idNumber = 201851234
#split id takes a number and outputs two halfs in (x,y) form both x and y are ints
#by casting from string to integer by typing int("1234") ==> 1234
#exp: 123456789 ==> (12345,6789)
#so that later we can acces both halfs like so:
#firsthalf would be splitid(number)[0] ==>(12345,6789)[0] ==> 12345
#secondhalf would be splitid(number)[1] ==>(12345,6789)[1] ==> 6789
def splitId(num):
	firstHalf = ""
	secondHalf = ""
	stringNum = str(num)
	numLen = len(stringNum)
	for i in range(0,len(stringNum)):
		if i <= numLen/2 :
			firstHalf += stringNum[i]
		if i > numLen/2:
			secondHalf +=stringNum[i]
	return (int(firstHalf), int(secondHalf))
#_____________________________

def checkIfEven(num):
	return True if num%2 == 0 else False
#_____________________________

def checkLessThanFive(num):
	return True if (num%10 > 0) and (num%10 <= 5) else False
#_____________________________
def biggestPrime(num):
	prime_factor = 1
	i = 2

	while i <= num / i:
		if num % i == 0:
			prime_factor = i
			num /= i
		else:
			i += 1

	if prime_factor < num:
		prime_factor = num

	return prime_factor
#____________________________

def inversNumber(num):
	result =""
	stringNum = str(num)
	for i in range(len(stringNum)-1, -1,-1):
		result += stringNum[i]
	return result
#____________________________

def countAge(day, month, year):
	currentDay = int(today.strftime("%d"))
	currentMonth = int(today.strftime("%m"))
	currentYear = int(today.strftime("%Y"))

        monthsoftheyear =[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 
          
        if (day > currentDay): 
            currentMonth = currentMonth - 1
            currentDay = currentDay + monthsoftheyear[month-1]  
                      
                      
        # if birth month exceeds given month, then  
        # donot count this year and add 12 to the  
        # month so that we can subtract and find out  
        # the difference  
        if (month > currentMonth): 
            currentYear = currentYear - 1
            currentMonth = currentMonth + 12
                      
        # calculate day, month, year  
        calculated_day = currentDay - day;  
        calculated_month = currentMonth - month;  
        calculated_year = currentYear - year; 

	if currentYear < year:
		print("invalid input: Please put a valid date.")
		return
	elif currentYear == year and currentMonth < month:
		print("invalid input: Please put a valid date.")
		return
	elif currentYear == year and currentMonth == month and currentDay < day:
		print("invalid input: Please put a valid date.")
		return
	elif month > 12 or day > 31:
		print("invalid input: Please put a valid date.")
		return
	elif month == 2 and day > 29:
		print("invalid input: Please put a valid date.")
		return


	print("Your age is: ",calculated_year,"years and",calculated_month,"months and",calculated_day,"days")


print(splitId(idNumber))
print(checkIfEven(splitId(idNumber)[0]))
print(checkLessThanFive(splitId(idNumber)[0]))
print(inversNumber(splitId(idNumber)[0]))
countAge(15,11,1999)


def lastTask():
	idnums = splitId(idNumber)
	half1 = idnums[0]
	half2 = idnums[1]
	if half2 < inversNumber(half2):
		print(countAge(15,11,1999))
