import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Picnic Game",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )

    # 아이템(인수)을 여러 개 전달(사용)
    parser.add_argument('item',
                        metavar='str',
                        nargs='+',   # 인수를 1개 이상 전달함
                        help='Item(s) to bring')

    # -s, --sorted를 사용하면 정렬 기능을 사용
    parser.add_argument('-s',
                        '--sorted',
                        action='store_true',
                        help='Sort the items')

    return parser.parse_args()  #명령줄 인수를 처리해서 반환함

def main():
    args = get_args()
    items = args.item  # 리스트
    # print(args.item)
    num = len(items)   # 아이템의 개수

    # 정렬 기능 구현
    if args.sorted:
        items.sort() #오름차순 정렬

    bringing = ''
    if num == 1:  # 명령행의 인수가 1개이면
        bringing = items[0] # bringing 변수에 1개 저장
    elif num == 2:
        bringing = ' and '.join(items)
    else:
        items[-1] = 'and ' + items[-1]
        bringing = ', '.join(items)

    print('You are brining {}.'.format(bringing))

if __name__=="__main__":
    main()