import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Jump the Five",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )

    parser.add_argument('text',
                        metavar='str',
                        help='Input text')

    return parser.parse_args()  #명령줄 인수를 처리해서 반환함

def main():
    args = get_args()
    # print(args.text)
    jumper = {'1': '9', '2': '8', '3': '7', '4': '6', '5': '0',
              '6': '4', '7': '3', '8': '2', '9': '1', '0': '5'}

    # 방법 1
    '''
    for char in args.text:
        print(jumper.get(char, char), end='')
    '''

    # 방법 2 - 새로운 문자열로 만들기
    '''
    new_text = ''
    for char in args.text:
        new_text += jumper.get(char, char)
    print(new_text)
    '''

    # 방법 3 - 리스트로 만들기
    '''
    new_text = []
    for char in args.text:
        new_text.append(jumper.get(char, char))
    print(''.join(new_text))  # 문자열.join()
    '''

    # 방법 4 - 리스트 내포
    print(''.join([jumper.get(char, char) for char in args.text]))

if __name__=="__main__":
    main()