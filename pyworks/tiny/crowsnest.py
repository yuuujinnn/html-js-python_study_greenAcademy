import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Crow's nest -- Choose the correct article",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )

    parser.add_argument('word',
                        metavar='word',
                        help='A word')
    return parser.parse_args()

def main():
    args = get_args()
    word = args.word
    # print(args.word)
    article = 'an' if word[0].lower() in 'aeiou' else 'a'

    print(f'Ahoy, Captain, {article} {word} off the laboard bow!')

if __name__=="__main__":
    main()