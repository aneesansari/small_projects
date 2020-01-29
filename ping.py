#Ping-Pong game in python 

import turtle

win = turtle.Screen()
win.title('Pong by Anees')
win.bgcolor('black')
win.setup(width=800, height=600)
win.tracer(0)


# Main game loop
while True:
	win.update()
