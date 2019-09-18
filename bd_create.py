def user_create():
    global user

    user_name = input('Enter your name: ')
    user = user_name


def profile_create():
    stat_info.append({
        'user info: ': user_info,
        'user name: ': user
    })

    return stat_info


def menu():
    print('1. Create User and Add Info about him.')
    print('2. Exit')


menu()
choose = int(input('Enter: '))

while choose != 2:
    user_create()
    user_info = input('Enter information about user: ')
    stat_info = []

    print(profile_create())
    file = open('data base.txt', 'a')

    file.write(str(stat_info) + '\n')
    file.close()

    print('File created')

    menu()
    choose = int(input())
