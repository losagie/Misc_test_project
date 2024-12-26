user_input = int(input("What is your chosen number?:"   ))

match user_input:
    case 100:
        print("Perfect number")
    case 150:
        print("imperfect number")
    case _:
        print("Sorry,invalid input")

x = 100
y = 150

print("Perfect number is {} and imperfect number is {}".format(x,y))







