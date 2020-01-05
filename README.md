## self_manage_api
### アプリの立ち上げ方
sbt run

### アプリの止め方
cntl + D

## その他設定周り
- sbt new playframework/play-java-seed.g8でアプリケーションの雛形作成
- playのバージョンは初期状態で2.8.0であるが、特にcontrollerで使いたいメソッドが多くあったため、2.6.11にバージョンダウン
- playのバージョンを下げるために、slacaVersionを2.12.8に下げる
- sbt-play-enhancerは、controllerで使いたいメソッドを導入してくれるツールかと思ったが、違った。そのため、なぜ入れているか分からない
- DBはMySQL
- ORマッパーはPlayEbean

## TODO
- 本番環境の環境構築（サーバー、DB）
- Dockerを導入して、誰もが開発をできるように
- CI使って楽したい

