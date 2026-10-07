### Program 1

print("Hello World")

### Program 2

usertext = input("What is your name? ")
print("Hello,", usertext)

### Program 3

num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

sum = float(num1) + float(num2)

print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))

### Program 4

num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

average = (int(num1) + int(num2))

print('Average:{0} '.format(average))

### Program 5

visagrade = input('Enter your visa grade: ')
finalgrade = input('Enter your final grade: ')

average = (float(visagrade)*.3)+(float(finalgrade)*.7)

print("Average: {0} ".format(average))

### Program 6

firstexam = input('Your first exam: ')
secondexam = input('Your second exam: ')
thirdexam = input('Your third exam: ')

average = (float(firstexam)+float(secondexam)+float(thirdexam))/3

print("Average: {0} ".format(average))

### Program 7

average = input('Enter average: ')

if int(average) >= 50:
    print("Passed")
else:
    print("Failed")

### Program 8

num = int(input("Enter a number: "))

if num % 2 == 0:
    print ("{0} is Even.".format(num))
else:
    print ("{0} is Odd.".format(num))

### Program 9

num = int(input("Enter a number: "))

if num > 0:
    print("Positive Number")
elif num == 0:
    print("Zero")
else:
    print("Negative Number")

### Program 10

print("Body mass index calculation program")

height = float(input("Enter height (m): "))
weight = int(input("Enter weight (kg): "))

index = weight/(height*height)

if index <= 18:
    print("\n underweight BMI: {}".format(index))
elif index > 18 and index <= 25:
    print("\n overweight BMI: {}".format(index))
elif index > 25 and index <= 30:
    print("\n obese BMI: {}".format(index))
elif index > 30:
    print("\n severely obese BMI: {}".format(index))

### Program 11

age = input('Enter age: ')

if int(age) < 18:
    print("Your age is not eligible to get a driver's license")
else:
    print("Your age is eligible to get your license")

### Program 12

for i in range(1, 101):
    print(i)

### Program 13

for i in range(1, 101):
    if i % 2 == 0:
        print(i)

### Program 14

for i in range(1, 101):
    if i % 2 != 0:
        print(i)

### Program 15

for i in range(1, int(num)+1):
    if i % 3 == 0 or i % 5 == 0:
        print(i)

### Program 16

num = input('Enter number: ')

for i in range(1, int(num)+1):
    print(i)

### Program 17

short     = input("Enter short side: ") 
tall      = input("Enter tall side: ")

average   = int(short)*int(tall)
perimeter = 2*(int(short)+int(tall))

print("Area: ".format(area))
print("Perimeter: ".format(perimeter))

### Program 18

word = 'mrhuseyin'

for char in word:
    print(char)

### Program 19

sumofnumbers = 0

num1 = input('First number: ')
num2 = input('SEcond number: ')

for i in range(int(num1)+1, int(num2)):
    sumofnumbers+=i

print("Sum of numbers between {0} and {1}: {2}".format(num1, num2, sumofnumbers))

### Program 20

selection = input("Press (1) for Cinema, (2) for Theater: ")
student   = input("Are you student (Y/N): ")

price = 0

if selection == '1':
    price = 10 # Cinema
elif selection == '2':
    price = 5 # Theatre

if student == 'Y' or student == 'y':
    price = price / 2 # 50%

print("The fee you have to pay: {}".format(price))

### Program 21

num = int(input("Enter a number: "))

if num > 1:
    for i in range(2, num):
        if (num % i) == 0:
            print(num, "is not a prime number")
            print(i, "times", num//i, "is", num)
            break
        else:
            print(num, "is a prime number")

else:
    print(num, "is not a prime number")

### Program 22

NumList  = []
Even_Sum = 0
Odd_Sum  = 0

Number = int(input("Please enter the Total Number of List Elements: "))

for i in range(1, Number + 1):
    value = int(input("Please enter the Value of %d Element: " %i))
    NumList.append(value)

for j in range(Number):
    if Numlist[j] % 2 == 0:
        Even_Sum = Even_Sum + NumList[j]
    else:
        Odd_Sum = Odd_Sum + NumList[j]

print("\nThe Sum of Even Numbers in this List = ", Even_Sum)
print("The Sum of Odd Numbers in this List = ", Odd_Sum)

### Program 23

newsalary = 0

salary = input("Enter new salary: ")
sraise = input("Salary raise rate (%): ")

newsalary = int(salary)+(int(salary)*int(sraise)/100)

print("Increased salary: ", newsalary)

### Program 24

import math

def find_Diameter(radius):
    return 2 * radius

def find_Circumference(radius):
    return 2 * math.pi * radius

def find_Area(radius):
    return math.pi * radius * radius

r = float(input(' Please enter the radius of a circle: '))

diameter = find_Diameter(r)
circumference = find_Circumference(r)
area = find_Area(r)

print("\n Diameter of a Circle = %.2f" %diameter)
print("\n Circumference of a Circle = %.2f" %circumference)
print("\n Area of a Circle = %.2f" %area)

### Program 25

def areaRectangle(a, b):
    return (a * b)

def perimeterRectangle(a, b):
    return (2 * (a + b))

a = 5
b = 6

print("Area = ", areaRectangle(a, b))
print("Perimeter = ", perimeterRectangleRectangle(a, b))

### Program 26

import random
import math
# Taking Inputs
lower = int(input("Enter lower bound: "))

# Taking Inputs
upper = int(input("Enter upper bound: "))

# generating random number between
# the lower and upper

x = random.randint(lower, upper)
print("\n\tYou\'ve only ", round(math.log(upper - lower + 1, 2)), " chances to guess the integer!\n")

# Initializing the number of guesses
count = 0

# for calculation of minimum number of
# guesses depends upon range

while count < math.log(upper - lower + 1, 2):
    count += 1

    guess = int(input("Guess a number: "))

    if x == guess:
        print("Congratulations you did it in", count, "try")
        break
    elif x > guess:
        print("You guessed too small!")
    elif x < guess:
        print("You guessed too high!")

if count >= math.log(upper - lower + 1, 2):
    print("\nThe number is %d" %x)
    print("\tBetter luck next time!")

### Program 27

import datetime

date = str(input('Enter the date (for example: 09 02 2019): '))
day_name = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
day = datetime.datetime.strptime(date, '%d %m %Y').weekday()
print(day_name[day])

### Program 28

def find_missing(lst):
    return [x for x in range(lst[0], lst[-1]+1) if x not in lst]

lst = [1, 2, 4, 6, 7, 9, 10]
print(find_missing(lst))

### Program 29

char_list = ["a", "b", "c"]
string = "abcd"

matched_list = [characters in char_list for characters in string]
print(matched_list)

string_contains_chars = all(matched_list)
print(string_contains_chars)

### Program 30

total    = 0
evenSums = 0
oddSums  = 0
done     = False

while(not Done):
    user_in = input("Give me an integer or type 'done' to be done.")
    if user_in.lower() == "done":
        done = True
    else:
        # assuming they've typed an integer
        total += int(user_in)
        if user_in % 2 == 0:
            evenSums += user_in
            evenAverage = evenSums / user_in
        else:
            oddSums += user_in
            oddAverage = oddSums / user_in

print(total)
print("Even Average: " + str(evenAverage))
print("Odd Average: " + str(oddAverage))