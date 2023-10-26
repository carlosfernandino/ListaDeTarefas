# Lista de Tarefas
Este é um aplicativo de lista de tarefas simples escrito em Java e usando a biblioteca Swing para a interface gráfica do usuário (GUI).

## Funcionalidades
O aplicativo permite que os usuários adicionem e removam tarefas de uma lista. A lista de tarefas é exibida em uma janela e as tarefas podem ser adicionadas digitando-as em um campo de texto e clicando em um botão para adicionar a tarefa à lista. As tarefas podem ser removidas selecionando-as na lista e clicando em um botão para removê-las.

## Componentes Principais
JFrame: Este é o quadro principal da aplicação. Ele é configurado para fechar o aplicativo quando a janela é fechada, tem um tamanho definido e é posicionado no centro da tela.
JList e DefaultListModel: Estes são usados para armazenar e exibir as tarefas. A JList exibe os dados do modelo.
JTextField: Este é o campo onde os usuários podem digitar novas tarefas.
JButton: Existem dois botões neste aplicativo. Um para adicionar novas tarefas à lista e outro para remover tarefas selecionadas.
ActionListener: Estes são usados para definir o que acontece quando os botões são clicados. Quando o botão de adição é clicado, a tarefa digitada no campo de texto é adicionada à lista. Quando o botão de remoção é clicado, a tarefa selecionada na lista é removida.

## Como Usar
Compile e execute o código Java.
Digite uma tarefa no campo de texto.
Clique no botão “+” para adicionar a tarefa à lista.
Selecione uma tarefa na lista.
Clique no botão “Remover tarefa” para remover a tarefa selecionada da lista.
