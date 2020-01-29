#game attempt

print('Hello! Wellcome to TRIVIA WITH ANEES!')

ans = input('Are you ready to play? (yes/no): ')
score = 0
total_q = 4

if ans.lower() == 'yes':

#This is basically the code for the questions once the quiz starts.
#It asks you a question and has a predetermined answer.
#The "ans.lower" is to convert your answer into lower case letters so it alligns wiht the correct answer.
#If the answer is correct your score goes +1 and it displays "correct" or else the opposite is displayed.
    
#Question 1
    #for this question there are 5 options for the answer. either one gives you a "correct".
    ans = input('1. What is one of the five pillars of Islam? ')
    if ans.lower() == 'shahadah' or ans.lower() == 'salah' or ans.lower() == 'sawm' or ans.lower() == 'zakah' or ans.lower() == 'hajj':
        score +=1
        print('correct')
    else:
        print('incorrect')

#Question 2
    ans = input('1. in Fajr salah, do you offer 2 rakah sunnah before or after the fard rakahs? ')
    if ans.lower() == 'before':
        score +=1
        print('correct')
    else:
        print('incorrect')

#Question 3
    ans = input('1. What is the first month of the Islamic calendar? ')
    if ans.lower() == 'muharram':
        score +=1
        print('correct')
    else:
        print('incorrect')

#Question 4
    ans = input("1. What is the name of the horse-like creature mentioned in the story of Mi'raj? ")
    if ans.lower() == 'buraq' or ans.lower() == 'buraaq':
        score +=1
        print('correct')
    else:
        print('incorrect')

#this here displays a thank you message and your "mark"(percentage) as well as your score.
#this peice of code is intended so it comes over the first "yes" for playing the game. otherwise, even if you said "no" to playing the game, your stats would be displayed.        

    print('Thanks for playing! I hope you had fun, you got', score, 'questions correct')
    mark = (score/total_q) * 100
    print('percentage:', str(mark) + '%')

print('goodbye')


