from datetime import datetime as dt

def name_logger(data):
    time = dt.now().strftime('\n%H:%M')
    with open('log.csv', 'a') as file:
        file.write('{}\nФИО:{}'
                   .format(time, data))

def phone_number_logger(data):
    with open('log.csv', 'a') as file:
        file.write('\nНомер телефона:{}'
                   .format(data))

def description_logger(data):
    with open('log.csv', 'a') as file:
        file.write('\nОписание:{}'
                   .format(data))
