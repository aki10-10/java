JAVA_HOME をセットするバッチファイルです。

	set-JAVA_HOME-{n}.cmd	システム環境変数 JAVA_HOME に付属の Java バージョン {n} をセット。
	show-JAVA_HOME.cmd		現在の JAVA_HOME や関連コマンドのバージョンを表示。
	_その他のファイル		内部呼び出し用。

* コマンドプロンプトを使用せず、Eclipse 内で完結する場合は JAVA_HOME の設定は不要です。
* コマンドプロンプトで Gradle や Maven などのコマンドを使用する場合は JAVA_HOME が必要です。
* Windows 再起動なしで反映されます（コマンドプロンプトの再起動は必要）。
* システム環境変数 PATH に %JAVA_HOME%\bin が含まれていない場合、先頭に追加されます。

複数の JAVA_HOME と PATH 環境変数の設定切り替えと確認 - Qiita
https://qiita.com/cypher256/items/815c2c38b294107cc52d
