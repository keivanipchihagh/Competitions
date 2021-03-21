import matplotlib
import pandas as pd

matplotlib.use('Agg')

train = pd.read_csv('data/train.csv')
test = pd.read_csv('data/test.csv')


def get_features():
    kmeans_features = [
        'GrLivArea',
        'TotalBsmtSF',
        'GarageArea',
    ]

    kmodes_features = [
        'YearBuilt',
        'YearRemodAdd',
        'FullBath',
        'GarageYrBlt',
        'Fireplaces',
    ]
    return kmeans_features, kmodes_features


def transform_quality(quality):
    """
    :param quality: in [1,10]
    :return: transformed quality in [1,3]
    """

    if quality <= 3:
        return 1
    elif quality <= 6:
        return 2
    else:
        return 3
    pass
