package com.github.intellij6502.highlighter;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * User: 67726e
 */

public class Asm6502SyntaxHighlighterFactory extends SyntaxHighlighterFactory {

	@NotNull
	@Override
	public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
		return new Asm6502SyntaxHighlighter();
	}
}
